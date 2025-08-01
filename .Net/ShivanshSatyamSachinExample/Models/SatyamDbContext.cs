﻿using Microsoft.EntityFrameworkCore;

namespace ShivanshSatyamSachinExample.Models
{
    public class SatyamDbContext : DbContext
    {
        public SatyamDbContext()
        {
        }

        public SatyamDbContext(DbContextOptions<SatyamDbContext> options)
            : base(options)
        {
        }

        public virtual DbSet<Department> Departments { get; set; }

        public virtual DbSet<Employee> Employees { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
            => optionsBuilder.UseSqlServer("Data Source=(localdb)\\MsSqlLocalDb;Initial Catalog=SatyamDb;Integrated Security=true");

    }
}
