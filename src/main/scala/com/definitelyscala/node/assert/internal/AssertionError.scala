package com.definitelyscala.node.assert.internal

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("assert.internal.AssertionError")
class AssertionError protected () extends com.definitelyscala.node.Error {
  def this(options: js.Any = js.native) = this()
  var name: String = js.native
  var message: String = js.native
  var actual: js.Any = js.native
  var expected: js.Any = js.native
  var operator: String = js.native
  var generatedMessage: Boolean = js.native
}
