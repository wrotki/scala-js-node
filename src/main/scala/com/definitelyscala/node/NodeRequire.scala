package com.definitelyscala.node

import scala.scalajs.js
import org.scalajs.dom.raw._
import scala.scalajs.js.|

@js.native
trait NodeRequire extends NodeRequireFunction {
  def resolve(id: String): String = js.native
  var cache: js.Any = js.native
  var extensions: js.Any = js.native
  var main: NodeModule | Unit = js.native
}