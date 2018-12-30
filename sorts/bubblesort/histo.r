slowfile = "C:/Users/jderiggi/documents/coderrust/basicalgos/sorts/bubblesort/bubbleiterations_slow.csv"
fastfile = "C:/Users/jderiggi/documents/coderrust/basicalgos/sorts/bubblesort/bubbleiterations_faster.csv"
slow <- read.csv(file = slowfile, header = T);
fast <- read.csv(file = fastfile, header = T);


slow$speed = "slow"
fast$speed = "fast"
head(slow)
slow_fast <- rbind(slow,fast)

head(slow_fast)
xyplot(slow_fast$iterations~slow_fast$size|slow_fast$speed,
       type = c("p", "smooth"), col.line = "darkorange", lwd = 1)

#mergey <- merge(slow,fast, by="size")
#head(mergey)
#colnames(mergey)[colnames(mergey)=="iterations.x"] <- "iterations_slow"
#colnames(mergey)[colnames(mergey)=="iterations.y"] <- "iterations_fast"
#head(mergey)

#library(lattice)

#xyplot(mergey$iterations_fast ~ mergey$size , grid=T,  ylim =c(0,max(mergey$iterations_slow)), scales = list(x = list(log = 10, equispaced.log = FALSE)),
#      type = c("p", "smooth"), col.line = "darkorange", lwd = 3)

#xyplot(mergey$iterations_slow ~ mergey$size , grid=T,  ylim =c(0,max(mergey$iterations_slow)), scales = list(x = list(log = 10, equispaced.log = FALSE)),
#      type = c("p", "smooth"), col.line = "darkorange", lwd = 3)
