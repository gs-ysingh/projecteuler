// recursive
function countWays(i, j, rows, cols) {
	if(i >= rows || j >= cols) {
		return 0;
	}
	if (i === rows - 1 && j === cols - 1) {
		return 1;
	}
	return countWays(i + 1, j, rows, cols) + countWays(i, j + 1, rows, cols);
}

//2*2 grid - will have 2, 2 as last index
console.log(countWays(0, 0, 3, 3));

// This will not work for 20 * 20 so let us use DP

const rows = 21;
const cols = 21;
let M = new Array(rows).fill(0);
for(let i = 0; i < rows; i++) {
	M[i] = new Array(cols).fill(0);
}

for(let i = 0; i < rows; i++) {
	M[i][0] = 1;
}

for(let i = 0; i < cols; i++) {
	M[0][i] = 1;
}

for(let i = 1; i < rows; i++) {
	for(let j = 1; j < cols; j++) {
		M[i][j] = M[i - 1][j] + M[i][j - 1];
	}
}

console.log(M[rows - 1][cols - 1])
