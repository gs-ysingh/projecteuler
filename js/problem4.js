function largestPalindrome() {
	let i = 999;
	let j = 0;
	let result = 0;
	while(i > 99) {
		j = makePalindrome(i);
		if(isProductOfThreeDigit(j)) {
			result = j;
			break;
		}
		i--;
	}
	return result;
}

function makePalindrome(n) {
	return parseInt(n + n.toString().split('').reverse().join(''));
}

function isProductOfThreeDigit(n) {
	for(let i = 999; i > 99; i--) {
		for(let j = 999; j > 99; j--) {
			if(i * j === n) {
				return true;
			}
		}
	}
	return false;
}

console.log(largestPalindrome());

