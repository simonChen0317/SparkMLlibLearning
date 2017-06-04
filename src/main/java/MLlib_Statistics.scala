
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.mllib.stat.Statistics

/**
  * Created by chenzp on 2017/5/14.
  */
object MLlib_Statistics {
  def main(args: Array[String]): Unit = {
    //    //MLlib Statistics是基础统计模块，是对RDD格式数据进行统计，包括：汇总统计，相关系数，分层抽样、假设检验、随机数据生成等。
    val conf = new SparkConf().setAppName("MLlib_Statistics").setMaster("local")
    val sc = new SparkContext(conf)
    //读取数据，转换成RDD（Vector）
    val data_path = "G:/MLlib/sample_stat.txt"
    val data = sc.textFile(data_path).map(_.split("\t")).map(f => f.map(f => f.toDouble))
    val data1 = data.map(f => Vectors.dense(f))
    //    System.out.println(data1.collect().toBuffer)
    //    //计算每列最大值、最小值、平均值、方差值、L1范数、L2范数
    //    val stat1= Statistics.colStats(data1)
    //    val statMax=stat1.max
    //    System.out.println("每列的最大值是："+statMax)
    //    val statMin=stat1.min
    //    System.out.println("每列的最小值是："+statMin)
    //    val statMean = stat1.mean
    //    System.out.println("每列的平均值是："+statMean)
    //    val statVariance=stat1.variance
    //    System.out.println("每列的方差值是："+statVariance)
    //    val statNorml1=stat1.normL1
    //    System.out.println("每列的L1范数是："+statNorml1)
    //    val statNorml2=stat1.normL2
    //    System.out.println("每列的L2范数是："+statNorml2)
    //
    //    //计算Pearson系数、Spearman系数
    val corr1 = Statistics.corr(data1, "pearson")
    System.out.println("Pearson系数:" + corr1)
//    val corr2 = Statistics.corr(data1, "spearman")
//    System.out.println("Spearman系数:" + corr2)
//    val x1 = sc.parallelize(Array(1.0, 2.0, 3.0, 4.0))
//    val y1 = sc.parallelize(Array(5.0, 6.0, 6.0, 6.0))
//    val corr3 = Statistics.corr(x1, y1, "pearson")
//    System.out.println("Pearson系数:" + corr3)


  }


}
