//package agh.wggios.analizadanych.sparksessionprovider
//
//import org.apache.spark.sql.SparkSession
//
//
//class SparkSessionProvider {
//
//  val spark: SparkSession = SparkSession.builder().config("spark.master", "local").getOrCreate()
//
//}
package agh.wggios.analizadanych.sparksessionprovider

import org.apache.spark.sql.SparkSession

trait SparkSessionProvider {

  val spark = SparkSession
    .builder
    .master("local[4]")
    .appName("spark-cruncher")
    .getOrCreate()
  def getSparkSession():SparkSession = {return spark}
}