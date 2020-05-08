const map = {
	'1': 'one',
	'2': 'two',
	'3': 'three',
	'4': 'four',
	'5': 'five',
	'6': 'six',
	'7': 'seven',
	'8': 'eight',
	'9': 'nine',
	'10': 'ten',
	'11': 'eleven',
	'12': 'twelve',
	'13': 'thirteen',
	'14': 'fourteen',
	'15': 'fifteen',
	'16': 'sixteen',
	'17': 'seventeen',
	'18': 'eighteen',
	'19': 'nineteen',
	'20': 'twenty',
	'30': 'thirty',
	'40': 'forty',
	'50': 'fifty',
	'60': 'sixty',
	'70': 'seventy',
	'80': 'eighty',
	'90': 'ninety',
	'100': 'hundred',
	'1000': 'thousand'
};

function getCountOfNumber(str) {
	return str.replace(/\s/g, '').length;
}

function getAsString(n) {
	if(map[n]) {
		if (n === 100) {
			return 'one' + map[100];
		}
		else if (n === 1000) {
			return 'one' + map[1000];
		}
 		return map[n];
	}
	else if(n > 1000) {
		return map[Math.floor(n / 1000)] + map[1000] + (n % 1000 !== 0 ? 'and' : '') + getAsString(n % 1000);
	}
	else if(n > 100) {
		return map[Math.floor(n / 100)] + map[100] + (n % 100 !== 0 ? 'and' : '') + getAsString(n % 100);
	}
	else if(n > 10) {
		return map[10 * Math.floor(n / 10)] + getAsString(n % 10);
	}
	return '';
}

function getCount(n) {
	let sum = 0;
	for(let i = 1; i <= n; i++) {
		sum = sum + getCountOfNumber(getAsString(i));
	}
	return sum;
}
console.log(getCount(1000));