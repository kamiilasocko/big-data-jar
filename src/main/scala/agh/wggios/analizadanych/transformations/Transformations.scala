package agh.wggios.analizadanych.transformations
import agh.wggios.analizadanych.caseclasses.{FlightCaseClass, OnlineRetailCaseClass}
import org.apache.log4j.Logger

class Transformations {
  @transient lazy val logger: Logger = Logger.getLogger(getClass.getName)

  def originIsDestination(flight_row: FlightCaseClass): Boolean = {
    logger.info("Doing transformation with dataset")

    return flight_row.ORIGIN_COUNTRY_NAME == flight_row.DEST_COUNTRY_NAME
  }

  def sumOfFlight(left:FlightCaseClass, right:FlightCaseClass): FlightCaseClass = {
    FlightCaseClass(left.DEST_COUNTRY_NAME, null, left.count + right.count)
  }
}
