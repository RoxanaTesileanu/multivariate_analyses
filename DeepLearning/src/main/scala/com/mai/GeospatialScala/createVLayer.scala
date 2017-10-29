package com.mai.GeospatialScala

import ReadPointCoordFromFile._
import CreateGeoms._


object CreateVLayer {

org.gdal.ogr.ogr.RegisterAll()
val driver = org.gdal.ogr.ogr.GetDriverByName("ESRI Shapefile")
val ds = driver.CreateDataSource("rdgps")
val googleMapSR = new org.gdal.osr.SpatialReference()
googleMapSR.ImportFromEPSG(3857)
val lyr = ds.CreateLayer("RoadsAndGPSTracks", googleMapSR, org.gdal.ogr.ogrConstants.wkbMultiLineString)
val fd1 = new org.gdal.ogr.FieldDefn("Type", org.gdal.ogr.ogrConstants.OFTString)
val fd2 = new org.gdal.ogr.FieldDefn("ID", org.gdal.ogr.ogrConstants.OFTInteger)
val newLyr = ds.GetLayer(0)
newLyr.CreateField(fd1)
newLyr.CreateField(fd2)
val usedDfn = newLyr.GetLayerDefn()






}

