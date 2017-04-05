package com.definitelyscala.node

import scala.scalajs.js

@js.native
trait Timer extends js.Object {
  def ref(): Unit = js.native
  def unref(): Unit = js.native
}