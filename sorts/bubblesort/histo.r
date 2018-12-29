slowfile = "C:/Users/jderiggi/documents/coderrust/basicalgos/sorts/bubblesort/bubbleiterations_slow.csv"
fastfile = "C:/Users/jderiggi/documents/coderrust/basicalgos/sorts/bubblesort/bubbleiterations_faster.csv"
slow <- read.csv(file = slowfile, header = T);
fast <- read.csv(file = fastfile, header = T);
plot(slow,fast)



mergey <- merge(slow,fast, by="size")
head(mergey)
colnames(mergey)[colnames(mergey)=="iterations.x"] <- "iterations_slow"
colnames(mergey)[colnames(mergey)=="iterations.y"] <- "iterations_fast"
head(mergey)

library(lattice)

xyplot(mergey$size ~ mergey$iterations_slow , grid=T,  scales = list(x = list(log = 10, equispaced.log = FALSE)),
       type = c("p", "smooth"), col.line = "darkorange", lwd = 3)
