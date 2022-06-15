package agh.wggios.analizadanych.datawriter
import agh.wggios.analizadanych.sparksessionprovider.SparkSessionProvider
import org.apache.spark.sql.DataFrame

import java.nio.file.{Files, Paths}

class DataWriter(path:String,df:DataFrame) extends SparkSessionProvider {
  if(!this.df.isEmpty) {
    if(Files.exists(Paths.get(path))){
      System.exit(0)
    }
    this.df.write.csv(path)
  } else{
    System.exit(0)
  }
}