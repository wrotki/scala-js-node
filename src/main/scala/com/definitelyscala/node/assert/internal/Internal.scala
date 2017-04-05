package com.definitelyscala.node.assert.internal

import scala.scalajs.js
@js.native
@js.annotation.JSGlobal("assert.internal")
object Internal extends js.Object {
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): Unit = js.native
  def ok(value: js.Any, message: String = js.native): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: String = js.native): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String = js.native): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: String = js.native): Unit = js.native
  def notDeepEqual(acutal: js.Any, expected: js.Any, message: String = js.native): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: String = js.native): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String = js.native): Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: String = js.native): Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: String = js.native): Unit = js.native
  def ifError(value: js.Any): Unit = js.native
}