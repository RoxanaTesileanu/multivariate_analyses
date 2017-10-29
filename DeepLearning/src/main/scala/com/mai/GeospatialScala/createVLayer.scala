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
val feat1 = new org.gdal.ogr.Feature(usedDfn)
import CreateGeoms._
feat1.SetGeometry(road1)
feat1.SetField("Type", "road")
feat1.SetField("ID", 1)
newLyr.CreateFeature(feat1)
val feat2 = new org.gdal.ogr.Feature(usedDfn)
feat2.SetGeometry(road2)
feat2.SetField("Type", "road")
feat2.SetField("ID", 2)
res5.CreateFeature(feat2)
val feat3 = new org.gdal.ogr.Feature(usedDfn)
feat3.SetGeometry(road3)
feat3.SetField("Type", "road")
feat3.SetField("ID", 3)
res5.CreateFeature(feat3)
val feat4 = new org.gdal.ogr.Feature(usedDfn)
feat4.SetGeometry(gpsTrack1)
feat4.SetField("Type", "gpstrack")
feat4.SetField("ID", 4)
res5.CreateFeature(feat4)
res5.GetFeatureCount
ds.FlushCache





}

