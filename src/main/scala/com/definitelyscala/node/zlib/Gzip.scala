package com.definitelyscala.node.zlib

import scala.scalajs.js
import com.definitelyscala.node.stream.{internal => stream}

// deflate/inflate only, empty dictionary by default
@js.native
trait Gzip extends stream.Transform {
}