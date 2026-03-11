import chisel3._

class And extends Module {
    val io = IO(new Bundle {
        val aIn = Input(UInt(1.W))
        val bIn = Input(UInt(1.W))
        val andOut = Output(UInt(1.W))
    })

    io.andOut := io.aIn & io.bIn
}

object GenVerilog extends App {
  val s = getVerilogString(new And())
  println(s)
}

//- start generate_options
// object HelloOption extends App {
//   emitVerilog(new And(), Array("--target-dir", "generated"))
// }
//- end
