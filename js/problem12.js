function getTriangleNumberWithNthDivisors(n) {
	let num = 1;
	let count = 0;
	let i = 1;
	while(true) {
		count = getDivisors(num);
		if(count >= n) {
			break;
		}
		i++;
		num = num + i; 
	}
	return num;
}

function getDivisors(n) {
	let limit = Math.floor(Math.sqrt(n));
	let arr = [];
	for(let i = 1; i <= limit; i++) {
		if(n % i === 0) {
			arr.push(i);
			if ((n / i) !== i) {
				arr.push(n / i);	
			}
		}
	}

	return arr.length;
}

console.log(getTriangleNumberWithNthDivisors(500));