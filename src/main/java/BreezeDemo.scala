import breeze.linalg._
import breeze.numerics._

/**
  * Created by chenzp on 2017/5/17.
  */
object BreezeDemo {
  def main(args: Array[String]): Unit = {
    //breeze创建函数
    val m1= DenseMatrix.zeros[Double](2,3)//全0 矩阵
    println(m1)
    val m2= DenseVector.zeros[Double](3)//全0 向量
    println("全0向量")
    println(m2)
    val m3= DenseMatrix.ones[Double](2,3)//全1矩阵
    println("全1矩阵")
    println(m3)
    val m4= DenseVector.ones[Double](3)//全1向量
    println("全1向量")
    println(m4)
    val m5= DenseVector.fill(3){5.0}//按数填充向量
    println("按数填充向量")
    println(m5)
    val m6= DenseVector.range(1,10,2)//生成随机向量
    println("生成随机向量")
    println(m6)
    val m7= DenseMatrix.eye[Double](3)//单位矩阵
    println("单位矩阵")
    println(m7)
    val m8 =diag(DenseVector(1.0,2.0,3.0))//对角矩阵
    println("对角矩阵")
    println(m8)
    val m9 = DenseMatrix((1.0,2.0,3.0),(4.0,5.0,6.0))//按照行创建矩阵
    println("按照行创建矩阵")
    println(m9)
    val m10= DenseVector((1,2,3))//按照行创建向量
    println("按照行创建向量")
    println(m10)
    val m11= m10.t//向量转置
    println("向量转置")
    println(m11)
    val m12= DenseVector.tabulate(3){i=>2*i}//从函数创建向量
    println(m12)
    val m13= DenseMatrix.tabulate(3,2){case(i,j)=>i+j}//从函数创建矩阵,i j代表下标
    println(m13)
    val m14= new DenseVector(Array(1,2,3,4))//从数组创建向量
    println(m14)
    val m15=new DenseMatrix(2,3,Array(11,12,13,21,22,23))//从数组创建矩阵
    //结果：11  13  22
//    12  21  23
    println(m15)
    val m16= DenseVector.rand(4)//0到1的随机向量
    println(m16)
    val m17= DenseMatrix.rand(2,3)//0到1的随机矩阵
    println(m17)

  }

}
