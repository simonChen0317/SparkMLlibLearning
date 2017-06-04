/**
  * Created by chenzp on 2017/6/4.
  */
import org.apache.spark.mllib.util.MLUtils
import org.apache.spark.sql.SparkSession
object MLUtilsDemo {
  def main(args: Array[String]): Unit = {
    val session = SparkSession.builder().appName("MLutilsDemo").master("local").getOrCreate()
    val filePath = "G://MLlib/data/sample_libsvm_data.txt"
    val data = MLUtils.loadLibSVMFile(session.sparkContext, filePath)
    println(data.take(1).toBuffer)
    println("test")
  }
}
