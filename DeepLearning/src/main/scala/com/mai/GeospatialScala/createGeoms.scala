package com.mai.GeospatialScala
import ReadPointCoordFromFile._
val currentPosition = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbPoint)
currentPosition.AddPoint(pointsRoad1(0)._1, pointsRoad1(0)._2)
currentPosition.GetX
currentPosition.GetY
val multiPointsHP1 = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbMultiPoint)
val multiPointPoint = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wbkPoint)
for (p <- pointsHP1) multiPointHP1.AddGeometry(multiPointPoint.AddPoint(p._1,p._2)
val road1 = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbLineString)
for (p <- pointsRoad1) road1.AddPoint(p._1, p._2)
road1.AddPoint(pointsRoad1(0)._1, pointsRoad1(0)._2)


