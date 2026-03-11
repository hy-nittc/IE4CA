import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class SimpleTest extends AnyFlatSpec with ChiselScalatestTester {
  "LogicOperation" should "work" in {
    test(new And).withAnnotations(Seq(WriteVcdAnnotation)) { dut =>
//    test(new And) { dut =>
            println("Start test")
            
            dut.io.aIn.poke(false.B)
            dut.io.bIn.poke(false.B)
            println(s"a=${dut.io.aIn.peek()},b=${dut.io.bIn.peek()}," +
              s"and${dut.io.andOut.peek()},")

            dut.io.aIn.poke(false.B)
            dut.io.bIn.poke(true.B)
            println(s"a=${dut.io.aIn.peek()},b=${dut.io.bIn.peek()}," +
              s"and${dut.io.andOut.peek()},")

            dut.io.aIn.poke(true.B)
            dut.io.bIn.poke(false.B)
            println(s"a=${dut.io.aIn.peek()},b=${dut.io.bIn.peek()}," +
              s"and${dut.io.andOut.peek()},")

            dut.io.aIn.poke(true.B)
            dut.io.bIn.poke(true.B)
            println(s"a=${dut.io.aIn.peek()},b=${dut.io.bIn.peek()}," +
              s"and${dut.io.andOut.peek()},")
    }
  }
}
