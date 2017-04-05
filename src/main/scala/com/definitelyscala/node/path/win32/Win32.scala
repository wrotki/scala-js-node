package com.definitelyscala.node.path.win32

import scala.scalajs.js
import com.definitelyscala.node.path.ParsedPath
@js.native
@js.annotation.JSGlobal("path.win32")
object Win32 extends js.Object {
  def normalize(p: String): String = js.native
  def join(paths: js.Any*): String = js.native
  def resolve(pathSegments: js.Any*): String = js.native
  def isAbsolute(p: String): Boolean = js.native
  def relative(from: String, to: String): String = js.native
  def dirname(p: String): String = js.native
  def basename(p: String, ext: String = js.native): String = js.native
  def extname(p: String): String = js.native
  var sep: String = js.native
  var delimiter: String = js.native
  def parse(p: String): ParsedPath = js.native
  def format(pP: ParsedPath): String = js.native
}