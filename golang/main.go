package main

import (
	"crypto/md5"
	"encoding/hex"
	"fmt"
)

func generateMD5(inputString string) string {
	bData := []byte(inputString)
	bMd5Hex := md5.Sum(bData)
	md5Hex := hex.EncodeToString(bMd5Hex[:])
	return md5Hex
}

func main() {
	inputString := "nhsteck.com"
	md5Hex := generateMD5(inputString)
	fmt.Println(md5Hex)
}
