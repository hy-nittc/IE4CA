FIRRTL version 1.2.0
circuit And :
  module And :
    input clock : Clock
    input reset : UInt<1>
    input io_aIn : UInt<1> @[And.scala 4:16]
    input io_bIn : UInt<1> @[And.scala 4:16]
    output io_andOut : UInt<1> @[And.scala 4:16]

    node _io_andOut_T = and(io_aIn, io_bIn) @[And.scala 10:25]
    io_andOut <= _io_andOut_T @[And.scala 10:15]
