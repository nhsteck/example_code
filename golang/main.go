package main

import (
	"crypto/md5"
	"crypto/sha1"
	"encoding/hex"
	"fmt"
)

func generateMD5(inputString string) string {
	bData := []byte(inputString)
	bMd5Hex := md5.Sum(bData)
	md5Hex := hex.EncodeToString(bMd5Hex[:])
	return md5Hex
}

func generateSHA1(inputString string) string {
	bData := []byte(inputString)
	bHex := sha1.Sum(bData)
	strHex := hex.EncodeToString(bHex[:])
	return strHex
}

func main() {
	inputString := "nhsteck.com"
	// strHex := generateMD5(inputString)
	strHex := generateSHA1(inputString)
	fmt.Println(strHex)
}
