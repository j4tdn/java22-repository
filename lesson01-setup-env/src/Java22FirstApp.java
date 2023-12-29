private static String convertListToString(String nameTable,List list) {
            StringBuilder stringBuilder = new StringBuilder();
                
            if("nhanvien".equals(nameTable) && !list.isEmpty()){
                        for (M_Nhanvien nv : (List<M_Nhanvien>) list) {
                        stringBuilder.append(nv.toString()).append("\n");
                    }
               
            }else if("sanpham".equals(nameTable) && !list.isEmpty()){
                    for (M_Sanpham sp : (List<M_Sanpham>) list) {
                        stringBuilder.append(sp.toString()).append("\n");
                    }
               
            }else if("ctsp".equals(nameTable) && !list.isEmpty()){
                    for (M_SanphamCT ctsp : (List<M_SanphamCT>) list) {
                        stringBuilder.append(ctsp.toString()).append("\n");
                    }
               }
                // Xóa dấu phẩy cuối cùng nếu có
                if (stringBuilder.length() > 0) {
                    stringBuilder.setLength(stringBuilder.length() - 1);
                }
            return stringBuilder.toString();
    }