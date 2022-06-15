package agh.wggios.analizadanych
import agh.wggios.analizadanych.sparksessionprovider.SparkSessionProvider

import agh.wggios.analizadanych.caseclasses.FlightCaseClass
import agh.wggios.analizadanych.datareader.DataReader
import agh.wggios.analizadanych.datawriter.DataWriter
import agh.wggios.analizadanych.transformations.Transformations


object Main extends SparkSessionProvider {

  def main(args: Array[String]): Unit = {
    import spark.implicits._

    val flightsDf =new DataReader("flight-data.csv").read().as[FlightCaseClass]
    val newDf= flightsDf.filter(flight_row => new Transformations().originIsDestination(flight_row)).show()

    flightsDf.groupByKey(x => x.DEST_COUNTRY_NAME).reduceGroups((l, r) => new Transformations().sumOfFlight(l, r)).show()
  }
}
