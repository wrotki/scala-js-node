package com.definitelyscala.node.zlib

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import scala.scalajs.js.|
@js.native
@js.annotation.JSGlobal("zlib")
object Zlib extends js.Object {
  //import * as stream from "stream";
  def createGzip(options: ZlibOptions = js.native): Gzip = js.native
  def createGunzip(options: ZlibOptions = js.native): Gunzip = js.native
  def createDeflate(options: ZlibOptions = js.native): Deflate = js.native
  def createInflate(options: ZlibOptions = js.native): Inflate = js.native
  def createDeflateRaw(options: ZlibOptions = js.native): DeflateRaw = js.native
  def createInflateRaw(options: ZlibOptions = js.native): InflateRaw = js.native
  def createUnzip(options: ZlibOptions = js.native): Unzip = js.native
  def deflate(buf: Buffer | String, callback: js.Function2[Error, Buffer, Unit]): Unit = js.native
  def deflateSync(buf: Buffer | String, options: ZlibOptions = js.native): Buffer = js.native
  def deflateRaw(buf: Buffer | String, callback: js.Function2[Error, Buffer, Unit]): Unit = js.native
  def deflateRawSync(buf: Buffer | String, options: ZlibOptions = js.native): Buffer = js.native
  def gzip(buf: Buffer, callback: js.Function2[Error, Buffer, Unit]): Unit = js.native
  def gzipSync(buf: Buffer, options: ZlibOptions = js.native): Buffer = js.native
  def gunzip(buf: Buffer, callback: js.Function2[Error, Buffer, Unit]): Unit = js.native
  def gunzipSync(buf: Buffer, options: ZlibOptions = js.native): Buffer = js.native
  def inflate(buf: Buffer, callback: js.Function2[Error, Buffer, Unit]): Unit = js.native
  def inflateSync(buf: Buffer, options: ZlibOptions = js.native): Buffer = js.native
  def inflateRaw(buf: Buffer, callback: js.Function2[Error, Buffer, Unit]): Unit = js.native
  def inflateRawSync(buf: Buffer, options: ZlibOptions = js.native): Buffer = js.native
  def unzip(buf: Buffer, callback: js.Function2[Error, Buffer, Unit]): Unit = js.native
  def unzipSync(buf: Buffer, options: ZlibOptions = js.native): Buffer = js.native
  // Constants
  var Z_NO_FLUSH: Double = js.native
  var Z_PARTIAL_FLUSH: Double = js.native
  var Z_SYNC_FLUSH: Double = js.native
  var Z_FULL_FLUSH: Double = js.native
  var Z_FINISH: Double = js.native
  var Z_BLOCK: Double = js.native
  var Z_TREES: Double = js.native
  var Z_OK: Double = js.native
  var Z_STREAM_END: Double = js.native
  var Z_NEED_DICT: Double = js.native
  var Z_ERRNO: Double = js.native
  var Z_STREAM_ERROR: Double = js.native
  var Z_DATA_ERROR: Double = js.native
  var Z_MEM_ERROR: Double = js.native
  var Z_BUF_ERROR: Double = js.native
  var Z_VERSION_ERROR: Double = js.native
  var Z_NO_COMPRESSION: Double = js.native
  var Z_BEST_SPEED: Double = js.native
  var Z_BEST_COMPRESSION: Double = js.native
  var Z_DEFAULT_COMPRESSION: Double = js.native
  var Z_FILTERED: Double = js.native
  var Z_HUFFMAN_ONLY: Double = js.native
  var Z_RLE: Double = js.native
  var Z_FIXED: Double = js.native
  var Z_DEFAULT_STRATEGY: Double = js.native
  var Z_BINARY: Double = js.native
  var Z_TEXT: Double = js.native
  var Z_ASCII: Double = js.native
  var Z_UNKNOWN: Double = js.native
  var Z_DEFLATED: Double = js.native
}