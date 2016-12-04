private void updateTable(){
        Object data[][] = new Object[this.list.size()][4];
        int x = 0;
        for(Anggota agt : this.list) {
            data[x][0] = agt.getNoAnggota();
            data[x][1] = agt.getNama();
            data[x][2] = agt.getAlamat();
            data[x][3] = agt.getPekerjaan();
            ++x;
        }
        tblAnggota.setModel(new DefaultTableModel(data, title));
    }
    
    private void showData(){
        Anggota agt = this.list.get(this.index);
        this.txtNoAnggota.setText(agt.getNoAnggota());
        this.txtNama.setText(agt.getNama());
        //this.txtAlamat.setToolTipText(agt.getAlamat());
        this.txtAlamat.setText(agt.getAlamat());
        this.txtPekerjaan.setText(agt.getPekerjaan());
    }
