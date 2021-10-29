// First, install crypto-js
// npm install --save crypto-js

// Import crypto-js library
var md5 = require('crypto-js/md5');
var sha1 = require('crypto-js/sha1');
var sha256 = require('crypto-js/sha256');

/**
 * Function for generate md5 string
 * @param {string} inputString: text need to generate MD5
 * @returns {string}
*/
function generateMD5(inputString) {
    let hashText = md5(inputString);
    return hashText;
}

/**
 * Function for generate sha1 string
 * @param {string} inputString: text need to generate
 * @returns {string}
*/
function generateSHA1(inputString) {
    let hashText = sha1(inputString);
    return hashText;
}

/**
 * Function for generate sha256 string
 * @param {string} inputString: text need to generate
 * @returns {string}
*/
function generateSHA256(inputString) {
    let hashText = sha256(inputString);
    return hashText;
}

// Test
var originText = "nhsteck.com";
var hashText = generateSHA256(originText).toString();
console.log(hashText);