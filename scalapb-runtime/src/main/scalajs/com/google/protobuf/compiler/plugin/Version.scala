// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.compiler.plugin

/** The version number of protocol compiler.
  *
  * @param suffix
  *   A suffix for alpha, beta or rc release, e.g., "alpha-1", "rc2". It should
  *   be empty for mainline stable releases.
  */
@SerialVersionUID(0L)
final case class Version(
    major: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
    minor: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
    patch: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
    suffix: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Version] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (major.isDefined) {
        val __value = major.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
      };
      if (minor.isDefined) {
        val __value = minor.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(2, __value)
      };
      if (patch.isDefined) {
        val __value = patch.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, __value)
      };
      if (suffix.isDefined) {
        val __value = suffix.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      major.foreach { __v =>
        val __m = __v
        _output__.writeInt32(1, __m)
      };
      minor.foreach { __v =>
        val __m = __v
        _output__.writeInt32(2, __m)
      };
      patch.foreach { __v =>
        val __m = __v
        _output__.writeInt32(3, __m)
      };
      suffix.foreach { __v =>
        val __m = __v
        _output__.writeString(4, __m)
      };
      unknownFields.writeTo(_output__)
    }
    def getMajor: _root_.scala.Int = major.getOrElse(0)
    def clearMajor: Version = copy(major = _root_.scala.None)
    def withMajor(__v: _root_.scala.Int): Version = copy(major = Option(__v))
    def getMinor: _root_.scala.Int = minor.getOrElse(0)
    def clearMinor: Version = copy(minor = _root_.scala.None)
    def withMinor(__v: _root_.scala.Int): Version = copy(minor = Option(__v))
    def getPatch: _root_.scala.Int = patch.getOrElse(0)
    def clearPatch: Version = copy(patch = _root_.scala.None)
    def withPatch(__v: _root_.scala.Int): Version = copy(patch = Option(__v))
    def getSuffix: _root_.scala.Predef.String = suffix.getOrElse("")
    def clearSuffix: Version = copy(suffix = _root_.scala.None)
    def withSuffix(__v: _root_.scala.Predef.String): Version = copy(suffix = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => major.orNull
        case 2 => minor.orNull
        case 3 => patch.orNull
        case 4 => suffix.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => major.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => minor.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => patch.map(_root_.scalapb.descriptors.PInt(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 4 => suffix.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.compiler.plugin.Version
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.compiler.Version])
}

object Version extends scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.Version] with scalapb.HasBuilder[com.google.protobuf.compiler.plugin.Version] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.Version] with scalapb.HasBuilder[com.google.protobuf.compiler.plugin.Version] = this
  def merge(`_message__`: com.google.protobuf.compiler.plugin.Version, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.compiler.plugin.Version = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.compiler.plugin.Version] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.compiler.plugin.Version(
        major = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
        minor = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
        patch = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
        suffix = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PluginProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PluginProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.compiler.plugin.Version(
    major = _root_.scala.None,
    minor = _root_.scala.None,
    patch = _root_.scala.None,
    suffix = _root_.scala.None
  )
  final class Builder private (
    private var __major: _root_.scala.Option[_root_.scala.Int],
    private var __minor: _root_.scala.Option[_root_.scala.Int],
    private var __patch: _root_.scala.Option[_root_.scala.Int],
    private var __suffix: _root_.scala.Option[_root_.scala.Predef.String],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.compiler.plugin.Version] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __major = Option(_input__.readInt32())
          case 16 =>
            __minor = Option(_input__.readInt32())
          case 24 =>
            __patch = Option(_input__.readInt32())
          case 34 =>
            __suffix = Option(_input__.readStringRequireUtf8())
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): com.google.protobuf.compiler.plugin.Version = {
      com.google.protobuf.compiler.plugin.Version(
          major = __major,
          minor = __minor,
          patch = __patch,
          suffix = __suffix,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.compiler.plugin.Version, com.google.protobuf.compiler.plugin.Version.Builder] {
    def apply(): Builder = new Builder(
      __major = _root_.scala.None,
      __minor = _root_.scala.None,
      __patch = _root_.scala.None,
      __suffix = _root_.scala.None,
      `_unknownFields__` = null
    )
    def apply(`_message__`: com.google.protobuf.compiler.plugin.Version): Builder = new Builder(
      __major = _message__.major,
      __minor = _message__.minor,
      __patch = _message__.patch,
      __suffix = _message__.suffix,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = com.google.protobuf.compiler.plugin.Version.Builder()
  def newBuilder(`_message__`: com.google.protobuf.compiler.plugin.Version): Builder = com.google.protobuf.compiler.plugin.Version.Builder(_message__)
  implicit class VersionLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.compiler.plugin.Version]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.compiler.plugin.Version](_l) {
    def major: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getMajor)((c_, f_) => c_.copy(major = Option(f_)))
    def optionalMajor: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.major)((c_, f_) => c_.copy(major = f_))
    def minor: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getMinor)((c_, f_) => c_.copy(minor = Option(f_)))
    def optionalMinor: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.minor)((c_, f_) => c_.copy(minor = f_))
    def patch: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getPatch)((c_, f_) => c_.copy(patch = Option(f_)))
    def optionalPatch: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.patch)((c_, f_) => c_.copy(patch = f_))
    def suffix: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getSuffix)((c_, f_) => c_.copy(suffix = Option(f_)))
    def optionalSuffix: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.suffix)((c_, f_) => c_.copy(suffix = f_))
  }
  final val MAJOR_FIELD_NUMBER = 1
  final val MINOR_FIELD_NUMBER = 2
  final val PATCH_FIELD_NUMBER = 3
  final val SUFFIX_FIELD_NUMBER = 4
  def of(
    major: _root_.scala.Option[_root_.scala.Int],
    minor: _root_.scala.Option[_root_.scala.Int],
    patch: _root_.scala.Option[_root_.scala.Int],
    suffix: _root_.scala.Option[_root_.scala.Predef.String]
  ): _root_.com.google.protobuf.compiler.plugin.Version = _root_.com.google.protobuf.compiler.plugin.Version(
    major,
    minor,
    patch,
    suffix
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.compiler.Version])
}
