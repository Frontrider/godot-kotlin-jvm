// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.Vector3
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * 2D agent used in navigation for collision avoidance.
 *
 * 2D agent that is used in navigation to reach a location while avoiding static and dynamic obstacles. The dynamic obstacles are avoided using RVO (Reciprocal Velocity Obstacles) collision avoidance. The agent needs navigation data to work correctly. This can be done by having the agent as a child of a [godot.Navigation2D] node, or using [setNavigation]. [godot.NavigationAgent2D] is physics safe.
 */
@GodotBaseType
public open class NavigationAgent2D : Node() {
  /**
   * Notifies when the final location is reached.
   */
  public val navigationFinished: Signal0 by signal()

  /**
   * Notifies when the navigation path changes. This can be triggered by the navigation system or by the user changing the path.
   */
  public val pathChanged: Signal0 by signal()

  /**
   * Notifies when the player-defined target, set with [setTargetLocation], is reached.
   */
  public val targetReached: Signal0 by signal()

  /**
   * Notifies when the collision avoidance velocity is calculated after a call to [setVelocity].
   */
  public val velocityComputed: Signal1<Vector2> by signal("safe_velocity")

  /**
   * The maximum number of neighbors for the agent to consider.
   */
  public open var maxNeighbors: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_MAX_NEIGHBORS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_MAX_NEIGHBORS, NIL)
    }

  /**
   * The maximum speed that an agent can move.
   */
  public open var maxSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_MAX_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_MAX_SPEED,
          NIL)
    }

  /**
   * The distance to search for other agents.
   */
  public open var neighborDist: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_NEIGHBOR_DIST, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_NEIGHBOR_DIST, NIL)
    }

  /**
   * The maximum distance the agent is allowed away from the ideal path to the final location. This can happen due to trying to avoid collisions. When the maximum distance is exceeded, it recalculates the ideal path.
   */
  public open var pathMaxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_PATH_MAX_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_PATH_MAX_DISTANCE, NIL)
    }

  /**
   * The radius of the agent.
   */
  public open var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_RADIUS, NIL)
    }

  /**
   * The distance threshold before a target is considered to be reached. This will allow an agent to not have to hit a point on the path exactly, but in the area.
   */
  public open var targetDesiredDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_TARGET_DESIRED_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_TARGET_DESIRED_DISTANCE, NIL)
    }

  /**
   * The minimal amount of time for which this agent's velocities, that are computed with the collision avoidance algorithim, are safe with respect to other agents. The larger the number, the sooner the agent will respond to other agents, but the less freedom in choosing its velocities. Must be positive.
   */
  public open var timeHorizon: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_TIME_HORIZON, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_TIME_HORIZON, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONAGENT2D)
  }

  public open fun _avoidanceDone(newVelocity: Vector3): Unit {
  }

  /**
   * Returns the distance to the target location, using the agent's global position. The user must set the target location with [setTargetLocation] in order for this to be accurate.
   */
  public open fun distanceToTarget(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_DISTANCE_TO_TARGET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the reachable final location in global coordinates. This can change if the navigation path is altered in any way. Because of this, it would be best to check this each frame.
   */
  public open fun getFinalLocation(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_FINAL_LOCATION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the path from start to finish in global coordinates.
   */
  public open fun getNavPath(): PoolVector2Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_NAV_PATH,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  /**
   * Returns which index the agent is currently on in the navigation path's [godot.core.PoolVector2Array].
   */
  public open fun getNavPathIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_NAV_PATH_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.Navigation2D] node that the agent is using for its navigation system.
   */
  public open fun getNavigation(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_NAVIGATION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * Returns a [godot.core.Vector2] in global coordinates, that can be moved to, making sure that there are no static objects in the way. If the agent does not have a navigation path, it will return the position of the agent's parent.
   */
  public open fun getNextLocation(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_NEXT_LOCATION,
        VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the user-defined target location (set with [setTargetLocation]).
   */
  public open fun getTargetLocation(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_GET_TARGET_LOCATION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns `true` if the navigation path's final location has been reached.
   */
  public open fun isNavigationFinished(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_IS_NAVIGATION_FINISHED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the target location is reachable. The target location is set using [setTargetLocation].
   */
  public open fun isTargetReachable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_IS_TARGET_REACHABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the target location is reached. The target location is set using [setTargetLocation]. It may not always be possible to reach the target location. It should always be possible to reach the final location though. See [getFinalLocation].
   */
  public open fun isTargetReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_IS_TARGET_REACHED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the [godot.Navigation2D] node used by the agent. Useful when you don't want to make the agent a child of a [godot.Navigation2D] node.
   */
  public open fun setNavigation(navigation: Node): Unit {
    TransferContext.writeArguments(OBJECT to navigation)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_NAVIGATION,
        NIL)
  }

  /**
   * Sets the user desired final location. This will clear the current navigation path.
   */
  public open fun setTargetLocation(location: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to location)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_TARGET_LOCATION, NIL)
  }

  /**
   * Sends the passed in velocity to the collision avoidance algorithm. It will adjust the velocity to avoid collisions. Once the adjustment to the velocity is complete, it will emit the [velocityComputed] signal.
   */
  public open fun setVelocity(velocity: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to velocity)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT2D_SET_VELOCITY, NIL)
  }
}