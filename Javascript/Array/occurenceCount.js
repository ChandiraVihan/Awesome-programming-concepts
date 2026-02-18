function countOccurrences(arr, target) {
  let count = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === target) {
      count++;
    }
  }
  return count;
}

// Example usage
console.log(countOccurrences([1, 2, 2, 2, 4, 2], 2));
// Output: 4