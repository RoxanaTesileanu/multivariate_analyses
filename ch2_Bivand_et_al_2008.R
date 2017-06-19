library(sp)

mycrs <- CRS(projargs="+proj=longlat")
m <- matrix(c(350, 85, 370, 95 ), ncol=2,  dimnames=list(NULL, c("min", "max")))
m
getClass("CRS") 
mySpatialObj <- Spatial(bbox=m, proj4string = mycrs)
mySpatialObj

