file = "C:/Users/jderiggi/documents/coderrust/basicalgos/other/nonLinearDiv.csv"
whiledata <- read.csv(file = file , header = T);
head(whiledata)
xyplot(whiledata$iterations~whiledata$size,
       type = c("p", "smooth"), col.line = "brown", lwd = 2)
