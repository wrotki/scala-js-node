package com.definitelyscala.node.punycode

import scala.scalajs.js

@js.native
trait ucs2 extends js.Object {
  def decode(string: String): js.Array[Double] = js.native
  def encode(codePoints: js.Array[Double]): String = js.native
}