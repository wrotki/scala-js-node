package com.definitelyscala.node.zlib.constants

import scala.scalajs.js
import com.definitelyscala.node.events.{internal => events}
@js.native
@js.annotation.JSGlobal("zlib.constants")
object Constants extends js.Object {
  // Allowed flush values.
  val Z_NO_FLUSH: Double = js.native
  val Z_PARTIAL_FLUSH: Double = js.native
  val Z_SYNC_FLUSH: Double = js.native
  val Z_FULL_FLUSH: Double = js.native
  val Z_FINISH: Double = js.native
  val Z_BLOCK: Double = js.native
  val Z_TREES: Double = js.native
  // Return codes for the compression/decompression functions. Negative values are errors, positive values are used for special but normal events.
  val Z_OK: Double = js.native
  val Z_STREAM_END: Double = js.native
  val Z_NEED_DICT: Double = js.native
  val Z_ERRNO: Double = js.native
  val Z_STREAM_ERROR: Double = js.native
  val Z_DATA_ERROR: Double = js.native
  val Z_MEM_ERROR: Double = js.native
  val Z_BUF_ERROR: Double = js.native
  val Z_VERSION_ERROR: Double = js.native
  // Compression levels.
  val Z_NO_COMPRESSION: Double = js.native
  val Z_BEST_SPEED: Double = js.native
  val Z_BEST_COMPRESSION: Double = js.native
  val Z_DEFAULT_COMPRESSION: Double = js.native
  // Compression strategy.
  val Z_FILTERED: Double = js.native
  val Z_HUFFMAN_ONLY: Double = js.native
  val Z_RLE: Double = js.native
  val Z_FIXED: Double = js.native
  val Z_DEFAULT_STRATEGY: Double = js.native
}