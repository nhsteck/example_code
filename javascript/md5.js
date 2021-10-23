// First, install crypto-js
// npm install --save crypto-js

// Import crypto-js library
var md5 = require('crypto-js/md5');

/**
 * Function for generate md5 string
 * @param {string} inputString: text need to generate MD5
 * @returns {string}
*/
function generateMD5(inputString) {
    let hashText = md5(inputString);
    return hashText;
}

// Test
var originText = "nhsteck.com";
var hashText = generateMD5(originText).toString();
console.log(hashText);