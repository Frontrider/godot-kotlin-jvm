// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PoolVector2Array
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.POOL_VECTOR2_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Server interface for low-level 2D navigation access.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/117](https://godotengine.org/asset-library/asset/117)
 *
 * Navigation2DServer is the server responsible for all 2D navigation. It handles several objects, namely maps, regions and agents.
 *
 * Maps are made up of regions, which are made of navigation polygons. Together, they define the navigable areas in the 2D world. For two regions to be connected to each other, they must share a similar edge. An edge is considered connected to another if both of its two vertices are at a distance less than [godot.Navigation.edgeConnectionMargin] to the respective other edge's vertex.
 *
 * To use the collision avoidance system, you may use agents. You can set an agent's target velocity, then the servers will emit a callback with a modified velocity.
 *
 * **Note:** The collision avoidance system ignores regions. Using the modified velocity as-is might lead to pushing and agent outside of a navigable area. This is a limitation of the collision avoidance system, any more complex situation may require the use of the physics engine.
 *
 * This server keeps tracks of any call and executes them during the sync phase. This means that you can request any change to the map, using any thread, without worrying.
 */
@GodotBaseType
public object Navigation2DServer : Object() {
  public override fun __new(): Unit {
    rawPtr = TransferContext.getSingleton(ENGINESINGLETON_NAVIGATION2DSERVER)
  }

  public override fun ____DO_NOT_TOUCH_THIS_isSingleton____() = true

  /**
   * Creates the agent.
   */
  public fun agentCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_AGENT_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns `true` if the map got changed the previous frame.
   */
  public fun agentIsMapChanged(agent: RID): Boolean {
    TransferContext.writeArguments(_RID to agent)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_AGENT_IS_MAP_CHANGED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Callback called at the end of the RVO process.
   */
  public fun agentSetCallback(
    agent: RID,
    `receiver`: Object,
    method: String,
    userdata: Any? = null
  ): Unit {
    TransferContext.writeArguments(_RID to agent, OBJECT to receiver, STRING to method, ANY to
        userdata)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_AGENT_SET_CALLBACK, NIL)
  }

  /**
   * Puts the agent in the map.
   */
  public fun agentSetMap(agent: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to agent, _RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_AGENT_SET_MAP,
        NIL)
  }

  /**
   * Sets the maximum number of other agents the agent takes into account in the navigation. The larger this number, the longer the running time of the simulation. If the number is too low, the simulation will not be safe.
   */
  public fun agentSetMaxNeighbors(agent: RID, count: Long): Unit {
    TransferContext.writeArguments(_RID to agent, LONG to count)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_AGENT_SET_MAX_NEIGHBORS, NIL)
  }

  /**
   * Sets the maximum speed of the agent. Must be positive.
   */
  public fun agentSetMaxSpeed(agent: RID, maxSpeed: Double): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to maxSpeed)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_AGENT_SET_MAX_SPEED, NIL)
  }

  /**
   * Sets the maximum distance to other agents this agent takes into account in the navigation. The larger this number, the longer the running time of the simulation. If the number is too low, the simulation will not be safe.
   */
  public fun agentSetNeighborDist(agent: RID, dist: Double): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to dist)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_AGENT_SET_NEIGHBOR_DIST, NIL)
  }

  /**
   * Sets the position of the agent in world space.
   */
  public fun agentSetPosition(agent: RID, position: Vector2): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR2 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_AGENT_SET_POSITION, NIL)
  }

  /**
   * Sets the radius of the agent.
   */
  public fun agentSetRadius(agent: RID, radius: Double): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to radius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_AGENT_SET_RADIUS,
        NIL)
  }

  /**
   * Sets the new target velocity.
   */
  public fun agentSetTargetVelocity(agent: RID, targetVelocity: Vector2): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR2 to targetVelocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_AGENT_SET_TARGET_VELOCITY, NIL)
  }

  /**
   * The minimal amount of time for which the agent's velocities that are computed by the simulation are safe with respect to other agents. The larger this number, the sooner this agent will respond to the presence of other agents, but the less freedom this agent has in choosing its velocities. Must be positive.
   */
  public fun agentSetTimeHorizon(agent: RID, time: Double): Unit {
    TransferContext.writeArguments(_RID to agent, DOUBLE to time)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_AGENT_SET_TIME_HORIZON, NIL)
  }

  /**
   * Sets the current velocity of the agent.
   */
  public fun agentSetVelocity(agent: RID, velocity: Vector2): Unit {
    TransferContext.writeArguments(_RID to agent, VECTOR2 to velocity)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_AGENT_SET_VELOCITY, NIL)
  }

  /**
   * Destroys the given RID.
   */
  public fun free(_object: RID): Unit {
    TransferContext.writeArguments(_RID to _object)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_FREE, NIL)
  }

  /**
   * Create a new map.
   */
  public fun mapCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_MAP_CREATE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the map cell size.
   */
  public fun mapGetCellSize(map: RID): Double {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_MAP_GET_CELL_SIZE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the point closest to the provided `to_point` on the navigation mesh surface.
   */
  public fun mapGetClosestPoint(map: RID, toPoint: Vector2): Vector2 {
    TransferContext.writeArguments(_RID to map, VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_MAP_GET_CLOSEST_POINT, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the owner region RID for the point returned by [mapGetClosestPoint].
   */
  public fun mapGetClosestPointOwner(map: RID, toPoint: Vector2): RID {
    TransferContext.writeArguments(_RID to map, VECTOR2 to toPoint)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_MAP_GET_CLOSEST_POINT_OWNER, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the edge connection margin of the map. The edge connection margin is a distance used to connect two regions.
   */
  public fun mapGetEdgeConnectionMargin(map: RID): Double {
    TransferContext.writeArguments(_RID to map)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_MAP_GET_EDGE_CONNECTION_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Returns the navigation path to reach the destination from the origin.
   */
  public fun mapGetPath(
    map: RID,
    origin: Vector2,
    destination: Vector2,
    optimize: Boolean
  ): PoolVector2Array {
    TransferContext.writeArguments(_RID to map, VECTOR2 to origin, VECTOR2 to destination, BOOL to
        optimize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_MAP_GET_PATH,
        POOL_VECTOR2_ARRAY)
    return TransferContext.readReturnValue(POOL_VECTOR2_ARRAY, false) as PoolVector2Array
  }

  /**
   * Returns `true` if the map is active.
   */
  public fun mapIsActive(nap: RID): Boolean {
    TransferContext.writeArguments(_RID to nap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_MAP_IS_ACTIVE,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the map active.
   */
  public fun mapSetActive(map: RID, active: Boolean): Unit {
    TransferContext.writeArguments(_RID to map, BOOL to active)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_MAP_SET_ACTIVE,
        NIL)
  }

  /**
   * Set the map cell size used to weld the navigation mesh polygons.
   */
  public fun mapSetCellSize(map: RID, cellSize: Double): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to cellSize)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_MAP_SET_CELL_SIZE, NIL)
  }

  /**
   * Set the map edge connection margin used to weld the compatible region edges.
   */
  public fun mapSetEdgeConnectionMargin(map: RID, margin: Double): Unit {
    TransferContext.writeArguments(_RID to map, DOUBLE to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_MAP_SET_EDGE_CONNECTION_MARGIN, NIL)
  }

  /**
   * Creates a new region.
   */
  public fun regionCreate(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_REGION_CREATE,
        _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Sets the map for the region.
   */
  public fun regionSetMap(region: RID, map: RID): Unit {
    TransferContext.writeArguments(_RID to region, _RID to map)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_REGION_SET_MAP,
        NIL)
  }

  /**
   * Sets the navigation mesh for the region.
   */
  public fun regionSetNavpoly(region: RID, navPoly: NavigationPolygon): Unit {
    TransferContext.writeArguments(_RID to region, OBJECT to navPoly)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_REGION_SET_NAVPOLY, NIL)
  }

  /**
   * Sets the global transformation for the region.
   */
  public fun regionSetTransform(region: RID, transform: Transform2D): Unit {
    TransferContext.writeArguments(_RID to region, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATION2DSERVER_REGION_SET_TRANSFORM, NIL)
  }
}