package agh.wggios.analizadanych.transformations
import agh.wggios.analizadanych.caseclasses.{FlightCaseClass, OnlineRetailCaseClass}

class Transformations {

  def originIsDestination(flight_row: FlightCaseClass): Boolean = {
    return flight_row.ORIGIN_COUNTRY_NAME == flight_row.DEST_COUNTRY_NAME
  }

  def sumOfFlight(left:FlightCaseClass, right:FlightCaseClass): FlightCaseClass = {
    FlightCaseClass(left.DEST_COUNTRY_NAME, null, left.count + right.count)
  }
}
