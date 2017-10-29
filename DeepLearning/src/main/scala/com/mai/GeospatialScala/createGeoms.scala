package com.mai.GeospatialScala
import ReadPointCoordFromFile._

object CreateGeoms {
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
val road2 = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbLineString)
for (p <- pointsRoad2) road2.AddPoint(p._1, p._2)
val road3 = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbLineString)
for (p <- pointsRoad3) road3.AddPoint(p._1, p._2)
val gpsTrack1 = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbLineString)
for (p<- pointsGPSTrack) gpsTrack1.AddPoint(p._1, p._2)
val multiLineLines = Array(road1, road2, road3, gpsTrack1)
val multiLineEx = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbMultiLineString)
for (l <- multiLineLines) multiLineEx.AddGeometry(l)
val habitatPatch1 = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbPolygon)
val habitatRing1 = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbLinearRing)
for (p<- pointsHP1) habitatRing.AddPoint(p._1, p._2)
habitatPatch1.AddGeometry(habitatRing1)
habitatPatch1.CloseRings()
val habitatPatch2 = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbPolygon)
val habitatRing2 = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbLinearRing)
for (p<- pointsHP2) habitatRing2.AddPoint(p._1, p._2)
habitatPatch2.AddGeometry(habitatRing2)
habitatPatch2.CloseRings()
val habitatPatch3 = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbPolygon)
val habitatRing3 = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbLinearRing)
for (p<- pointsHP3) habitatRing3.AddPoint(p._1, p._2)
habitatPatch3.AddGeometry(habitatRing3)
habitatPatch3.CloseRings()
val stArea = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbPolygon)
val ringStArea = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbLinearRing)
for (p <- pointsStArea) ringStArea.AddPoint(p._1, p._2)
stArea.AddGeometry(ringStArea)
stArea.CloseRings()
val multiPolygonEx = new org.gdal.ogr.Geometry(org.gdal.ogr.ogrConstants.wkbMultiPolygon)
val multiPolyPolys = Array(habitatPatch1, habitatPatch2, habitatPatch3, stArea)
for (poly <- multiPolyPolys) multiPolygonEx.AddGeometry(poly)
}

