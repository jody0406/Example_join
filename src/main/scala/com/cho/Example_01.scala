package com.cho

import org.apache.spark.sql.SparkSession

object Example_01 {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("hkProject").
      config("spark.master", "local").
      getOrCreate()



    var testArray = Array(22,33,50,70,90,100)

    var answer = testArray.filter(x=>{ x%10==0})

    var score = 9

    var Level = "기타"
    if(score >9){
      Level = "수"
    }





  }
}