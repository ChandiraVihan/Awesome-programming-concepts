function sortAscending(arr) {
  return arr.sort((a, b) => a - b);
}

// Example usage
console.log(sortAscending([9, 2, 5, 1, 5, 6]));
// Output: [1, 2, 5, 5, 6, 9]