import subprocess

files = [
"CountOfLeafNodes",
"PrintNonLeafNodesWithOnlyOneChild",
"CreationOfBST",
"PrintNonLeafNodesWithOnlyRightSubTree",
"DeletionInBST",
"PrintOnlyLeafNodes",
"DepthFirstTraversalLevelOrderTraversal",
"SecondLargestValueInBST",
"DepthFirstTraversalReverseLevelOrderTraversal",
"SecondSmallestValueInBST",
"InorderSuccessor",
"SmallestValueInBST",
"LargestValueInBST",
"SumOfLeafNodes",
"PrintNonLeafNodesWithAtleastOneChild",
"TreeSort",
"PrintNonLeafNodesWithBothChilds",
"TwoSumProblemOnBST",
"PrintNonLeafNodesWithOnlyLeftSubTree"
]

for file in files:
    print("\n==============================")
    print("Running:", file)
    print("==============================")
    
    subprocess.run(["javac", f"{file}.java"])
    subprocess.run(["java", file])