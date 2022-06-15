package agh.wggios.analizadanych.caseclasses

case class OnlineRetailCaseClass(InvoiceNo: BigInt, StockCode: BigInt, Description: String, Quantity: Int,InvoiceDate: String, UnitPrice: BigDecimal, CustomerId: BigDecimal, Country: String )
case class FlightCaseClass(DEST_COUNTRY_NAME: String, ORIGIN_COUNTRY_NAME: String, count: BigInt)
