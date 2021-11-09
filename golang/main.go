package main

import (
	"crypto/md5"
	"crypto/sha1"
	"crypto/sha256"
	"crypto/sha512"
	"encoding/hex"
	"fmt"

	"golang.org/x/crypto/argon2"
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

func generateSHA256(inputString string) string {
	bData := []byte(inputString)
	bHex := sha256.Sum256(bData)
	strHex := hex.EncodeToString(bHex[:])
	return strHex
}

func generateSHA512(inputString string) string {
	bData := []byte(inputString)
	bHex := sha512.Sum512(bData)
	strHex := hex.EncodeToString(bHex[:])
	return strHex
}

func generateArgon2(inputString string) string {
	salt := []byte("12345678")
	var iterators uint32 = 2
	var memory uint32 = 16
	var parallelism uint8 = 2
	var hashLen uint32 = 16

	// Choose version
	// argon2i: argon2.Key(...)
	// argon2id: argon2.IDKey(...)
	bData := []byte(inputString)
	bHex := argon2.IDKey(bData, salt, iterators, memory, parallelism, hashLen)
	strHex := hex.EncodeToString(bHex[:])
	return strHex
}

func main() {
	inputString := "nhsteck.com"
	// strHex := generateMD5(inputString)
	// strHex := generateSHA1(inputString)
	// strHex := generateSHA256(inputString)
	// strHex := generateSHA512(inputString)
	strHex := generateArgon2(inputString)
	fmt.Println(strHex)
}
