package com.definitelyscala.node

import scala.scalajs.js
import org.scalajs.dom.raw._
import scala.scalajs.js.|

@js.native
trait NodeModule extends js.Object {
  var exports: js.Any = js.native
  var require: NodeRequireFunction = js.native
  var id: String = js.native
  var filename: String = js.native
  var loaded: Boolean = js.native
  var parent: NodeModule | Null = js.native
  var children: js.Array[NodeModule] = js.native
}