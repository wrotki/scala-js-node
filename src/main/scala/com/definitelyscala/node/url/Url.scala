package com.definitelyscala.node.url

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Url extends js.Object {
  var href: String = js.native
  var protocol: String = js.native
  var auth: String = js.native
  var hostname: String = js.native
  var port: String = js.native
  var host: String = js.native
  var pathname: String = js.native
  var search: String = js.native
  var query: String | js.Any = js.native
  var slashes: Boolean = js.native
  var hash: String = js.native
  var path: String = js.native
}
@js.native
@js.annotation.JSGlobal("url")
object Url extends js.Object {
  def parse(urlStr: String, parseQueryString: Boolean = js.native, slashesDenoteHost: Boolean = js.native): Url = js.native
  def format(url: Url): String = js.native
  def resolve(from: String, to: String): String = js.native
}