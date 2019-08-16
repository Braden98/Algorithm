public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = true;    //标记符
        //
        if(root == null){
            return res;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            TreeNode treeNode = null;
            List<Integer> numList = new ArrayList<>();
     
            for(int i = 0; i < size; i++){
                treeNode = q.poll();
                
                if(flag){
                   numList.add(treeNode.val); 
                }else{
                   numList.add(0, treeNode.val);  
                }
                if(treeNode.left != null){
                    q.offer(treeNode.left);
                }
                if(treeNode.right != null){
                    q.offer(treeNode.right);
                }
            }
            flag = !flag;
            res.add(numList);
        }
        return res;
    }
