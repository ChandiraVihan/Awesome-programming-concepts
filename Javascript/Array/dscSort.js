function sortDescending(arr) {
  return arr.sort((a, b) => b - a);
}

// Example usage
console.log(sortDescending([5, 2, 9, 1, 5, 6]));
// Output: [9, 6, 5, 5, 2, 1]