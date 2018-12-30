file = "C:/Users/jderiggi/documents/coderrust/basicalgos/arraysandbinarysearch/other/whilecounter.csv"
whiledata <- read.csv(file = file , header = T);
head(whiledata)
xyplot(whiledata$iterations~whiledata$size,
       type = c("p", "smooth"), col.line = "darkorange", lwd = 2)
