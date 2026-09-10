/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var averageOfSubtree = function(root) {
    let count = 0;

    // Helper function that returns [sum, nodeCount] for a given subtree
    const calculateSubtree = (node) => {
        if (!node) {
            return [0, 0];
        }

        // Post-order traversal: compute values from left and right children first
        const [leftSum, leftCount] = calculateSubtree(node.left);
        const [rightSum, rightCount] = calculateSubtree(node.right);

        // Calculate the current subtree's total sum and total node count
        const currentSum = leftSum + rightSum + node.val;
        const currentCount = leftCount + rightCount + 1;

        // Check if the current node's value equals the floor of the subtree average
        if (node.val === Math.floor(currentSum / currentCount)) {
            count++;
        }

        return [currentSum, currentCount];
    };

    calculateSubtree(root);
    return count;
};
