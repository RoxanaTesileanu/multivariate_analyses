package com.mai.GeospatialScala

import ReadPointCoordFromFile._
import CreateGeoms._

object CreateVLayer {

org.gdal.ogr.ogr.RegisterAll()
val driver = org.gdal.ogr.ogrJNI.GetDriverByName("ESRI Shapefile")
val ds = driver.CreateDataSource("rdgps")
val googleMapSR = new org.gdal.osr.SpatialReference()
googleMapSR.ImportFromEPSG(
val lyr = ds.CreateLayer("RoadsAndGPSTracks", googleMapSR, wkbMultiLineString)








}
