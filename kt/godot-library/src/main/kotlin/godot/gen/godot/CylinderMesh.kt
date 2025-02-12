// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Class representing a cylindrical [godot.PrimitiveMesh].
 *
 * Class representing a cylindrical [godot.PrimitiveMesh]. This class can be used to create cones by setting either the [topRadius] or [bottomRadius] properties to `0.0`.
 */
@GodotBaseType
public open class CylinderMesh : PrimitiveMesh() {
  /**
   * Bottom radius of the cylinder. If set to `0.0`, the bottom faces will not be generated, resulting in a conic shape.
   */
  public open var bottomRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_GET_BOTTOM_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_SET_BOTTOM_RADIUS,
          NIL)
    }

  /**
   * Full height of the cylinder.
   */
  public open var height: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_GET_HEIGHT, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_SET_HEIGHT, NIL)
    }

  /**
   * Number of radial segments on the cylinder. Higher values result in a more detailed cylinder/cone at the cost of performance.
   */
  public open var radialSegments: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_GET_RADIAL_SEGMENTS,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_SET_RADIAL_SEGMENTS,
          NIL)
    }

  /**
   * Number of edge rings along the height of the cylinder. Changing [rings] does not have any visual impact unless a shader or procedural mesh tool is used to alter the vertex data. Higher values result in more subdivisions, which can be used to create smoother-looking effects with shaders or procedural mesh tools (at the cost of performance). When not altering the vertex data using a shader or procedural mesh tool, [rings] should be kept to its default value.
   */
  public open var rings: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_GET_RINGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_SET_RINGS, NIL)
    }

  /**
   * Top radius of the cylinder. If set to `0.0`, the top faces will not be generated, resulting in a conic shape.
   */
  public open var topRadius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_GET_TOP_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CYLINDERMESH_SET_TOP_RADIUS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CYLINDERMESH)
  }
}
